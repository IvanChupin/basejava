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
    protected void doUpdate(Resume resume) {
        mapStorage.put(resume.getUuid(), resume);
    }

    @Override
    protected boolean isInStorage(String uuid) {
        return mapStorage.containsKey(uuid);
    }

    @Override
    protected void doSave(Resume resume) {
        mapStorage.put(resume.getUuid(), resume);
    }

    @Override
    protected Resume doGet(String uuid) {
        return mapStorage.get(uuid);
    }


    @Override
    protected void doDelete(String uuid) {
        mapStorage.remove(uuid);
    }
    @Override
    public Resume[] getAll() {
        return mapStorage.values().toArray(new Resume[mapStorage.size()]);
    }

    @Override
    public int size() {
        return mapStorage.size();
    }

}
