package com.urise.webapp.storage;

import com.urise.webapp.exception.StorageException;
import com.urise.webapp.model.Resume;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Array based storage for Resumes
 */
public abstract class AbstractArrayStorage extends AbstractStorage {

    protected static final int STORAGE_LIMIT = 10_000;
    protected Resume[] storage;
    protected int size;

    public AbstractArrayStorage() {
        storage = new Resume[STORAGE_LIMIT];
    }

    public int size() {
        return size;
    }

    public void clear() {
        Arrays.fill(storage, 0, size, null);
        size = 0;
    }

    @Override
    protected List<Resume> doCopyAll() {
        return Arrays.asList(Arrays.copyOfRange(storage,0,size));
    }

    @Override
    protected void doSave(Object index, Resume resume) {
        if (size == STORAGE_LIMIT) {
            throw new StorageException("Storage overflow", resume.getUuid());
        } else {
            insertElement(resume, (Integer) index);
            size++;
        }
    }

    @Override
    protected void doUpdate(Object index, Resume resume) {
        storage[(Integer) index] = resume;
    }

    @Override
    protected void doDelete(Object index) {
        fillDeletedElement((Integer) index);
        storage[size - 1] = null;
        size--;
    }


    @Override
    protected Resume doGet(Object index) {
        return storage[(Integer) index];
    }


//    @Override
//    public List<Resume> getAllSorted(){
//        List<Resume> allSorted = new ArrayList<Resume>();
//        for(int i =0; i<=storage.length;i++){
//            allSorted.add(storage[i]);
//        }
//        allSorted.sort(new Comparator<Resume>() {
//            @Override
//            public int compare(Resume o1, Resume o2) {
//               return o1.getFullName().compareTo(o2.getFullName());
//            }
//        });
//        return allSorted;
//    }

    @Override
    protected boolean isExist(Object index) {
        return (Integer) index >= 0;
    }



    protected abstract Integer getSearchKey(String uuid);

    protected abstract void insertElement(Resume r, int index);

    protected abstract void fillDeletedElement(int index);


}
