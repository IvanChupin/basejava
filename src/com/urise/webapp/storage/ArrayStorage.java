package com.urise.webapp.storage;

import com.urise.webapp.model.Resume;

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {

    Resume[] storage;
    private int size;

    public ArrayStorage() {
        storage = new Resume[5];
    }

    public void clear() {
        storage = new Resume[5];
        size = 0;
    }

    public void update(Resume r) {

        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(r.getUuid())) {
                storage[i] = r;
            }
        }

    }

    public void save(Resume resume) {

        for (int i = 0; i < size; i++)
            if (storage[i].getUuid().equals(resume.getUuid())) {
                System.out.printf("!!!Resume is already in storage!!!");
                return;
            }
        if (size < storage.length) {
            storage[size] = resume;
            size++;
        } else System.out.println("!!!There is no more space in the storage!!!");
    }

    public Resume get(String uuid) {
        for (int j = 0; j < size; j++) {
            if (storage[j].getUuid().equals(uuid)) {
                return storage[j];
            }
        }
        return null;
    }

    public void delete(String uuid) {
        for (int i = 0; i < size; i++) {
            if (storage[i].getUuid().equals(uuid)) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                size--;
            }

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
}
