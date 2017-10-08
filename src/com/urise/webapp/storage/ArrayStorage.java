package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {

    Resume[] storage;
    private int size;

    public ArrayStorage() {
        storage = new Resume[10];
    }

    public void clear() {
        storage = new Resume[10];
        size = 0;
    }

    public void update(Resume resume) {
        int index = getIndex(resume.getUuid());
        if (index == -1) {
            System.out.println("Resume " + resume.getUuid() + " doesn't exist");
        } else
            storage[index] = resume;

    }


    public void save(Resume resume) {

        if (getIndex(resume.getUuid()) != -1) {
            System.out.println("Resume " + resume.getUuid() + " is already in storage");
            update(resume);
            System.out.println("Resume was added");
        } else if (size == storage.length) {
            System.out.println("Storage overflow");
        } else {
            storage[size] = resume;
            size++;
        }
    }

    public Resume get(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {
            System.out.println("Resume " + uuid + " doesn't exist");
            return null;
        }
        return storage[index];
    }


    public void delete(String uuid) {
        int index = getIndex(uuid);
        if (index == -1) {

        } else {
            storage[index] = storage[size - 1];
            storage[size - 1] = null;
            size--;
        }
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    public Resume[] getAll() {
        Resume[] tmpStorage = new Resume[size];
        for (int j = 0; j < size; j++) {
            tmpStorage[j] = storage[j];
        }
        return tmpStorage;
    }

    public int size() {
        return size;
    }

    private int getIndex(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid))
                return i;
        }
        return -1;


    }
}
