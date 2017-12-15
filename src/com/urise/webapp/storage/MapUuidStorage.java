package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapUuidStorage extends AbstractStorage<String> {
    protected HashMap<String, Resume> mapStorage = new HashMap<>();


    @Override
    protected List<Resume> doCopyAll() {
        return new ArrayList<>(mapStorage.values());
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
    protected void doSave(String uuid, Resume resume) {
        mapStorage.put(resume.getUuid(), resume);
    }

    @Override
    protected void doUpdate(String uuid, Resume resume) {
        mapStorage.put(uuid, resume);
    }

    @Override
    protected void doDelete(String uuid) {
        mapStorage.remove(uuid);
    }

    @Override
    protected boolean isExist(String uuid) {
        return uuid != null;
    }

    @Override
    protected String getSearchKey(String uuid) {
        if (mapStorage.containsKey(uuid)) {
            return uuid;
        } else return null;
        // return uuid;
    }

    @Override
    protected Resume doGet(String uuid) {
        return mapStorage.get(uuid);
    }
}
