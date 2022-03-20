package com.capgemini.Feb21;

import java.util.*;

class Mobile{
    // Write your code here..
	HashMap<String, ArrayList<String>> mobiles=new HashMap<String, ArrayList<String>>();

    public String addMobile(String company, String model){

        ArrayList<String> a1=null;
        if(mobiles.containsKey(company)){
            a1=mobiles.get(company);
            a1.add(model);
        }
        else{
            ArrayList<String> a2=new ArrayList<>();
            a2.add(model);
            mobiles.put(company,a2);
        }

        return "model successfully added";

    }

    public ArrayList<String> getModels(String company){

        ArrayList<String> a3=null;
        if(mobiles.containsKey(company)){
            a3=mobiles.get(company);
        }
        return a3;
    }
    public String buyMobile(String company, String model){

        if(mobiles.containsKey(company)){
            if (mobiles.get(company).contains(model)){
                mobiles.get(company).remove(model);
                return "mobile sold successfully";
            }
        }

            return "item not available";

    }
}