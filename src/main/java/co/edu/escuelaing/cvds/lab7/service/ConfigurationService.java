package co.edu.escuelaing.cvds.lab7.service;

import co.edu.escuelaing.cvds.lab7.model.Employee;
import co.edu.escuelaing.cvds.lab7.repository.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConfigurationService {
    private final ConfigurationRepository configurationRepository;

    @Autowired
    public ConfigurationService(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    public Employee addConfiguration(Employee configuration) {
        return configurationRepository.save(configuration);
    }

    public Employee getConfiguration(String propiedad) {
        return configurationRepository.findByPropiedad(propiedad).get(1);
    }

    public List<Employee> getAllConfigurations() {
        return configurationRepository.findAll();
    }

    public Employee updateConfiguration(Employee configuration) {
        if (configurationRepository.findByPropiedad(configuration.getPropiedad()).size() == 0) {
            return configurationRepository.save(configuration);
        }

        return null;
    }

    public void deleteConfiguration(String propiedad) {
        configurationRepository.deleteById(propiedad);
    }

    public String getPremio() {
        return configurationRepository.findByPropiedad("premio").get(0).getValor();
    }
}