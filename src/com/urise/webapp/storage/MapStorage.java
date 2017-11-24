package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.HashMap;

public class MapStorage extends AbstractStorage {
    protected HashMap<String, Resume> mapStorage = new HashMap<>(10_000, 0.75f);

    @Override
    public void clear() {
        mapStorage.clear();
    }
    @Override
    public Resume[] getAll() {
        return mapStorage.values().toArray(new Resume[mapStorage.size()]);
    }

    @Override
    public int size() {
        return mapStorage.size();
    }

    @Override
    protected void doSave(Object searchKey, Resume resume) {
        mapStorage.put((String) searchKey,resume);
    }

    @Override
    protected void doUpdate(Object searchKey, Resume resume) {
        mapStorage.put((String) searchKey,resume);
    }

    @Override
    protected void doDelete(Object searchKey) {
        mapStorage.remove((String)searchKey);
    }

    @Override
    protected boolean isExist(Object searchKey) {
        return searchKey!=null;
    }

    @Override
    protected String getSearchKey(String uuid) {
        if (mapStorage.containsKey(uuid)){
            return uuid;
        }
        else return null;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return mapStorage.get((String)searchKey);
    }
}
