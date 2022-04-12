package org.texttechnologylab.DockerUnifiedUIMAInterface.driver;

import java.util.HashMap;
import java.util.Map;

public class IDUUIPipelineComponent {
    private HashMap<String, String> _options;

    public IDUUIPipelineComponent() {
        _options = new HashMap<>();
    }

    public IDUUIPipelineComponent(Map<String,Object> options) {
        _options = new HashMap<>();
        for(Map.Entry<String,Object> entry : options.entrySet()) {
            _options.put(entry.getKey(),String.valueOf(entry.getValue()));
        }
    }
    public IDUUIPipelineComponent(IDUUIPipelineComponent other) {
        _options = other._options;
    }

    public void setOption(String key, String value) {
        _options.put(key, value);
    }

    public String getOption(String key) {
        return _options.get(key);
    }

    public boolean hasOption(String key) {
        return _options.containsKey(key);
    }

    public Map<String,String> getOptions() {return _options;}

    public void withName(String name) {
        setOption("name",name);
    }

    public String getName() {
        return getOption("name");
    }

    public String removeOption(String key) {
        return _options.remove(key);
    }
}
