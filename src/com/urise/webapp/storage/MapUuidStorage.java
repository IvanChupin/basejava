package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapUuidStorage extends AbstractStorage {
    protected HashMap<String, Resume> mapStorage = new HashMap<>();


    @Override
    protected List<Resume> doCopyAll() {
        return new ArrayList<Resume>(mapStorage.values());
    }

    @Override
    public void clear() {
        mapStorage.clear();
    }

    @Override
    public int size() {
        return mapStorage.size();
    }

    @Override
    protected void doSave(Object searchKey, Resume resume) {
        mapStorage.put(resume.getUuid(),resume);
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
        // return uuid;
    }

    @Override
    protected Resume doGet(Object searchKey) {
        return mapStorage.get((String)searchKey);
    }
}
