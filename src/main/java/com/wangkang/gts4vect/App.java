package com.wangkang.gts4vect;


import org.apache.log4j.Logger;
import org.geotools.data.DataStore;
import org.junit.Test;

/**
 * @author wangkang
 * @email iwuang@qq.com
 * @date 2019/1/24 14:46
 */
public class App {

    public static void main(String[] args) {

        PGDatastore pgDatastore = new PGDatastore();
        DataStore datastore = PGDatastore.getDefeaultDatastore();
        Geotools geotools = new Geotools(datastore);
        String geojsonpath = "C:\\test\\ChinaWorldCitysBigbelin\\chinaCompany2.geojson";
        String shpfilepath = "E:\\Temp\\shap\\MuchBig.shp";
        String pgtableName = "test";

//        geotools.geojson2pgtable(geojsonpath, pgtableName);
//        geotools.geojson2shp(geojsonpath, shpfilepath);
//        geotools.shp2geojson(shpfilepath, geojsonpath);
//        geotools.shp2pgtable(shpfilepath, pgtableName);
        utility.tagLast("shp导入postgis");

//        geotools.pgtable2geojson(pgtableName, geojsonpath);
        geotools.pgtable2shp(pgtableName, shpfilepath, "geom");


    }

    @Test
    public void importData(){
        DataStore datastore = PGDatastore.getDefeaultDatastore();
        Geotools geotools = new Geotools(datastore);
        String geojsonpath = "D:\\git\\gts4vect\\src\\main\\java\\com\\wangkang\\gts4vect\\polygon.geojson";
        String shpfilepath = "E:\\Temp\\shap\\MuchBig.shp";
        String pgtableName = "test2";
        geotools.geojson2pgtable(geojsonpath, pgtableName);
    }

    @Test
    public void export(){
        DataStore datastore = PGDatastore.getDefeaultDatastore();
        Geotools geotools = new Geotools(datastore);
        String shpfilepath = "E:\\Temp\\shap\\MuchBig.shp";
        String pgtableName = "test2";
        geotools.pgtable2shp(pgtableName, shpfilepath, "geom");
    }

    private static Logger logger = Logger.getLogger(App.class);
    private static Utility utility = new Utility();

}
