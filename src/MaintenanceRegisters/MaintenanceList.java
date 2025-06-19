/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRegisters;

import GoRide.Lists;

/**
 *
 * @author autoa
 */
public class MaintenanceList implements Lists<MaintenanceRegister> {
    private MaintenanceRegister[] list;

    @Override
    public boolean add(MaintenanceRegister t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(MaintenanceRegister t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == t) {
                list[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max-1; j++) {
                if (list[j] != null && list[j+1] != null) {
                    if (list[j].getId() > list[j+1].getId()) {
                        MaintenanceRegister temp = list[j];
                        list[j] = list[j+1];
                        list[j+1] = temp;
                    }
                }
            }
        }   
    }

    @Override
    public MaintenanceRegister search(Object id) {
        int idt = Integer.parseInt(id.toString());
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if (list[i].getId() == idt) {
                return list[i];
            }
        }
        return null;
    }

    public MaintenanceList() {
        this.list = new MaintenanceRegister[100];
    }
    
}
