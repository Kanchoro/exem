package library;

import java.util.Arrays;

public class Crud {
    private library [] libraries= new library[0];
    private int size=0;


    public void addLibrary(library newLibrary){
        libraries = Arrays.copyOf(libraries,libraries.length+1);
        libraries[libraries.length-1]=newLibrary;
        size++;
    }
    public void add(library [] libraries){
        for (library newStudent : libraries) {
            addLibrary(newStudent);
        }
    }


    public library[] getAllLibrary(){
        for (library library : libraries) {
            System.out.println(library);
        }
        return null;

    }

    public void getById(long id){
        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i].getId()==id){
                System.out.println(libraries[i]);
            }
        }
    }
    public String updateById(long id , library newLibrary){
        for (int i = 0; i < libraries.length; i++) {
            if (libraries[i].getId()==(id)){
                libraries[i]=newLibrary;
                break;
            }
        }
        return "invalid id!";
    }
    public void deleteById(long id){
        for (int i = 0; i < size; i++) {
            if (libraries[i].getId() ==id){
                for (int j = i; j < size-1; j++) {
                    libraries[j] = libraries[j+1];
                }
                size--;
                System.out.println("deleted!");
            }
        }
        libraries = Arrays.copyOf(libraries,libraries.length-1);
    }

}
