package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStorage extends AbstractStorage<Integer> {

    private final int STORAGE_LIMIT = 10_000;
    protected List<Resume> listStorage = new ArrayList<>(STORAGE_LIMIT);


    @Override
    public void clear() {
        listStorage.clear();
    }

    

    @Override
    public int size() {
        return listStorage.size();
    }

    @Override
    protected void doSave(Integer searchKey, Resume resume) {
        listStorage.add(resume);
    }

    @Override
    protected void doUpdate(Integer searchKey, Resume resume) {
        listStorage.set(searchKey, resume);
    }

    @Override
    protected void doDelete(Integer searchKey) {
        listStorage.remove(searchKey.intValue());
    }

    @Override
    protected boolean isExist(Integer searchKey) {
        return searchKey != null;
    }

    @Override
    protected List<Resume> doCopyAll() {
        return new ArrayList<>(listStorage);
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
    protected Resume doGet(Integer searchKey) {
        return listStorage.get(searchKey);
    }
}


