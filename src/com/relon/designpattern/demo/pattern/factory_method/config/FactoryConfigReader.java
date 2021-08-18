package com.relon.designpattern.demo.pattern.factory_method.config;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class FactoryConfigReader {
    public static Map<String, String> readConfig(String path) {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        Map<String, String> configMap = new HashMap<>();
        try {
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document document = docBuilder.parse(new File(path));
            // 取根节点
            Element root = document.getDocumentElement();
            System.out.println(root.getNodeName());

            NodeList factoryConfigs = document.getElementsByTagName("factoryConfig");
            for (int i = 0; i < factoryConfigs.getLength(); i++) {
                Node node = factoryConfigs.item(i);
                String key = document.getElementsByTagName("produceClass").item(i).getFirstChild().getNodeValue();
                String value = document.getElementsByTagName("factoryClass").item(i).getFirstChild().getNodeValue();
                configMap.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return configMap;
    }

    public static Object getFactory(String produceName) {
        Map<String, String> factoryMap =
                readConfig("D:\\project_myself\\design_pattern\\src\\com\\relon\\designpattern\\demo\\pattern\\factory_method\\conf\\config.xml");
        if (factoryMap.containsKey(produceName)) {
            String className = "com.relon.designpattern.demo.pattern.factory_method." + factoryMap.get(produceName);
            try {
                Class<?> aClass = Class.forName(className);
                return aClass.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return null;
    }
 }
