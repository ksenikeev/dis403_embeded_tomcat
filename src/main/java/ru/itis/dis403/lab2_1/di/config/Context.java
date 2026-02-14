package ru.itis.dis403.lab2_1.di.config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Context {

    private String scanPath = "ru.itis.dis403.lab2_1.di";

    private Map<Class<?>, Object> components = new HashMap<>();

    public Object getComponent(Class clazz) {
        return components.get(clazz);
    }

    private void scanComponent() {
        List<Class<?>> classes = PathScan.find(scanPath);

        // Создание экземпляров компонент
    }

}
