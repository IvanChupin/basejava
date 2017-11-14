package com.urise.webapp.storage;
import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    protected List<Resume> listStorage = new ArrayList<>(10_000);


    @Override
    public void clear() {
        listStorage.clear();
    }

    @Override
    protected boolean isInStorage(String uuid) {
        for (Resume r:listStorage) {
            if (r.getUuid().equals(uuid)){
                return true;
            }
        }
        return false;
    }

    @Override
    protected void doUpdate(Resume resume) {
        listStorage.set(getIndex(resume.getUuid()),resume);
    }

    @Override
    protected void doSave(Resume resume) {
        listStorage.add(resume);
    }

    @Override
    protected Resume doGet(String uuid) {
        return listStorage.get(getIndex(uuid));
    }

    @Override
    protected void doDelete(String uuid) {
        listStorage.remove(getIndex(uuid));
    }



    public Resume[] getAll() {
        return listStorage.toArray(new Resume[listStorage.size()]);
    }

    @Override
    public int size() {
        return listStorage.size();
    }


    private int getIndex(String uuid) {
        if (listStorage.size() != 0) {
            for (int i = 0; i < listStorage.size(); i++) {
                if (uuid.equals(listStorage.get(i).getUuid())) {
                    return i;
                }
            }
            return -1;
        }else return -1;
    }
}


