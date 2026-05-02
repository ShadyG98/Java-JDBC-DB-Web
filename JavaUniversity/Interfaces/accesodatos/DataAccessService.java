package dataAccess;

public interface DataAccessService {
    int MAX_REGISTRY = 10;

    void insert();

    void list();

    void update();

    void delete();
}