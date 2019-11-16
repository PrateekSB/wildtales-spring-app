package org.wildtales.wildtalesspringapp.configuration;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import org.wildtales.wildtalesspringapp.dto.TaleDTO;
import org.wildtales.wildtalesspringapp.model.Tale;

@Component
public class TaleMapper extends ConfigurableMapper {

    @Override
    protected void configure(MapperFactory factory) {
        super.configure(factory);
        factory.classMap(TaleDTO.class, Tale.class)
                .mapNulls(false)
                .byDefault()
                .register();
    }


}
