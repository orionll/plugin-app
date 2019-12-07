import org.example.pluginapp.core.IService;
import org.example.pluginapp.plugin1.Service1;

module plugin1 {
    requires core;

    provides IService with Service1;
}