package org.joyful4j.framework.bean;

import java.util.Map;

/**
 * 返回视图对象
 * Created by richey on 16-9-15.
 * @author richey
 * @since 1.0.SNAPSHOT
 */
public class View {

    /**
     * 视图路径
     */
    private String path;
    /**
     * 模型数据
     */
    private Map<String,Object> model;

    public View addModel(String key,Object value){
        model.put(key,value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
