package guviTask7;

import java.util.TreeMap;
import java.util.Map;

public class EmployeeTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> employeeMap = new TreeMap<>();
        
        employeeMap.put(102, "Alice");
        employeeMap.put(101, "Bob");
        employeeMap.put(103, "Charlie");
        
        System.out.println("Employee names in alphabetical order:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println( entry.getValue());
        }
    }
}

