package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader{

    @Override
    public String readln() {
        List<String> myArray = new ArrayList<String>();
        myArray.add("Here");
        myArray.add("is");
        myArray.add("my");
        myArray.add("array");

        String output = "";

        for (int i = 0; i < myArray.size(); i++)
        {
            output += myArray.get(i) + " ";
        }
        return output;
    }
}
