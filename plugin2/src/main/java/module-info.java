import org.example.pluginapp.core.IService;
import org.example.pluginapp.plugin2.Service2;

module plugin2 {
    requires core;

    provides IService with Service2;
}