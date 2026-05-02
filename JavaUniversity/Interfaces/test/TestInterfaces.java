package interfacesTest;

import dataAccess.DataAccessService;
import dataAccess.MySqlDataAccess;
import dataAccess.OracleDataAccess;

public class TestInterfaces {
    public static void main(String[] args) {
        DataAccessService data = new MySqlDataAccess();
        print(data);

        data = new OracleDataAccess();
        print(data);
    }

    public static void print(DataAccessService data) {
        data.list();
    }
}