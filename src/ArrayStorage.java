

/**
 * Array based storage for Resumes
 */
public class ArrayStorage {

    Resume[] storage;
    private int i;

    public ArrayStorage() {
        storage = new Resume[10_000];
    }

    void clear() {
        storage = new Resume[10_000];
        i = 0;
    }

    void save(Resume r) {
        storage[i] = r;
        i++;
    }

    Resume get(String uuid) {
        for (int j = 0; j < i; j++) {
            if (storage[j].uuid.equals(uuid)) {
                return storage[j];
            }
        }
        return null;
    }

    void delete(String uuid) {
        int k = 0;
        Resume[] tmpStorage = new Resume[10_000];
        for (int j = 0; j < i; j++) {
            if (!storage[j].uuid.equals(uuid)) {
                tmpStorage[k] = storage[j];
                k++;
            }
        }
        storage = tmpStorage;
        i--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] tmpStorage = new Resume[i];
        for (int j = 0; j < i; j++) {
            tmpStorage[j] = storage[j];
        }
        return tmpStorage;
    }

    int size() {
        return i;
    }
}
