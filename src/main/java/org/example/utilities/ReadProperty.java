package org.example.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;

public class ReadProperty {
    public static Properties properties = null;
    Properties prop = new Properties();
    static ReadProperty readProperty = new ReadProperty();


    public ReadProperty(){

    }

    public static ReadProperty getInstance(){
        return readProperty;}

    public String readProperties(String element){
        if(properties == null){
            this.loadProperties();
        }
        return prop.getProperty(element);
    }

    private void loadProperties()
    {
        properties = new Properties();
        InputStream in = null;
        Enumeration resources = null;

        try{
            resources = BaseTest.class.getClassLoader().getResources("test.properties");
        } catch (Exception exception){
            exception.printStackTrace();
        }

        while(resources != null && resources.hasMoreElements()){
            try{
                in = ((URL)resources.nextElement()).openStream();
                properties.load(in);
            }catch (IOException exception)
            {
                exception.printStackTrace();

            } finally{
                closeInputStream(in);
            }
        }

    }

    private void closeInputStream(InputStream in){
        if (in!= null){
            try{
                in.close();
            } catch (IOException exception){
                exception.printStackTrace();
            }
        }
    }



}
