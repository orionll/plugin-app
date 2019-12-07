import org.example.pluginapp.core.BasicService;
import org.example.pluginapp.core.IService;

module core {
    requires java.desktop;
    exports org.example.pluginapp.core;

    uses IService;
    provides IService with BasicService;
}