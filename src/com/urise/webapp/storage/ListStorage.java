package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.List;

public class ListStorage extends AbstractStorage {

    private final int STORAGE_LIMIT = 10_000;
    protected List<Resume> listStorage = new ArrayList<>(STORAGE_LIMIT);


    @Override
    public void clear() {
        listStorage.clear();
    }


    public Resume[] getAll() {
        return listStorage.toArray(new Resume[listStorage.size()]);
    }

    @Override
    public int size() {
        return listStorage.size();
    }

    @Override
    protected void doSave(Object searchKey, Resume resume) {
        listStorage.add(resume);
    }

    @Override
    protected void doUpdate(Object searchKey, Resume resume) {
        listStorage.set((Integer) searchKey, resume);
    }

    @Override
    protected void doDelete(Object searchKey) {
        listStorage.remove(((Integer) searchKey).intValue());
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return searchKey != null;
    }

    @Override
    protected Integer getSearchKey(String uuid) {
        for (int i = 0; i < listStorage.size(); i++) {
            if (listStorage.get(i).getUuid().equals(uuid)) {
                return i;
            }
        }
        return null;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return listStorage.get((int) searchKey);
    }
}


