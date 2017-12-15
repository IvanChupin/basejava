package com.urise.webapp.storage;

import com.urise.webapp.exception.ExistStorageException;
import com.urise.webapp.exception.NotExistStorageException;
import com.urise.webapp.model.Resume;

import java.util.Collections;
import java.util.List;

public abstract class AbstractStorage<S> implements Storage {


    protected abstract void doSave(S searchKey, Resume resume);

    protected abstract void doUpdate(S searchKey, Resume resume);

    protected abstract void doDelete(S searchKey);

    protected abstract boolean isExist(S searchKey);

    protected abstract S getSearchKey(String uuid);

    protected abstract Resume doGet(S searchKey);

    protected abstract List<Resume> doCopyAll();

    public void save(Resume resume) {
        S searchKey = getNotExistedSearchKey(resume.getUuid());
        doSave(searchKey, resume);
    }


    @Override
    public List<Resume> getAllSorted() {
        List<Resume> list = doCopyAll();
        Collections.sort(list);
        return list;
    }



    public void update(Resume resume) {
        S searchKey = getExistedSearchKey(resume.getUuid());
        doUpdate(searchKey, resume);
    }

    public void delete(String uuid) {
        S searchKey = getExistedSearchKey(uuid);
        doDelete(searchKey);
    }


    public Resume get(String uuid) {
        S searchKey = getExistedSearchKey(uuid);
        return doGet(searchKey);
    }


    private S getExistedSearchKey(String uuid) {
        S searchKey = getSearchKey(uuid);
        if (!isExist(searchKey)) {
            throw new NotExistStorageException(uuid);
        }
        return searchKey;
    }

    private S getNotExistedSearchKey(String uuid) {
        S searchKey = getSearchKey(uuid);
        if (isExist(searchKey)) {
            throw new ExistStorageException(uuid);
        }
        return searchKey;
    }


}