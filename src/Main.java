import enums.LibraryType;
import library.Crud;
import library.library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        library library = new library("osmonov","kana",3,"Bishkek", LibraryType.PUBLIC);
        library library2 = new library("osmonov2","kana2",4,"Bishkek2", LibraryType.NATIONAL);
        library library3 = new library("osmonov3","kana3",5,"Bishkek3", LibraryType.PUBLIC);

        Crud crud = new Crud();
        crud.add(new library[]{library,library2,library3});
        crud.updateById(1,new library("osmonova","kana",3,"Bishkek", LibraryType.PUBLIC));
        crud.getAllLibrary();

    }
}