package nasserKhosravi.designpattern.structural.composite;

import nasserKhosravi.designpattern.structural.composite.participants.Dir;

/**
 * Created by Naser on 5/3/2017
 *
 * We want obtain number of {@link MyFile} in our directory and their sub directory
 * We support these file {@link Dir} , {@link TextFile} in every directory
 */
public class EntryPointComposite {
    private Dir root;

    private void printResult() {
        System.out.println("root have "+root.treeFileCount()+" tree file");
    }


    private void populateList(){

        root=new Dir("d1");

        /////////////////////////
        Dir song = new Dir("song");
        Dir gallery=new Dir("gallery");
        TextFile textRoot=new TextFile("textRoot");
        root.add(song);
        root.add(gallery);
        root.add(textRoot);
        ////////////////////////

        //////////////////////
        Dir rap=new Dir("rap");
        Dir pop=new Dir("pop");
        song.add(rap);
        song.add(pop);
        //////////////////////

        /////////////////////
        Dir myImage=new Dir("my");
        Dir friendImage=new Dir("friend");
        gallery.add(myImage);
        gallery.add(friendImage);
        //////////////////////

        rap.add(new TextFile("sr1"));
    }



}
