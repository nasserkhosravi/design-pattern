package nasserKhosravi.designpattern.structural.composite.participants;

import nasserKhosravi.designpattern.structural.composite.MyFile;

import java.util.ArrayList;


public class Dir extends MyFile {

    private ArrayList<MyFile> list=new ArrayList<>();
    private static int number;

    public Dir(String name) {
        super(name,DIR);
    }

    public void add(MyFile file){
        list.add(file);
    }

    void remove(int position){
        list.remove(position);
    }

    private ArrayList<MyFile> getSubOrdinate(){
        return list;
    }

    private void calculateTreeFileCount(ArrayList<MyFile> list){

        for (MyFile aList : list) {
            if (aList.getType() == DIR) {
                number++;
                Dir dir = (Dir) aList;
                calculateTreeFileCount(dir.getSubOrdinate());
            } else {
                number++;
            }
        }

    }

    public int treeFileCount(){
        number = 0;
        calculateTreeFileCount(list);
        return number;
    }

}
