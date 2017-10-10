
package org.mainlogic.spring.security.common;

import java.lang.reflect.Field;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;

@Service
public class LogInjector implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(final Object bean, String beanName) throws BeansException {

		ReflectionUtils.doWithFields(bean.getClass(), new FieldCallback() {

			@Override
			public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {

				ReflectionUtils.makeAccessible(field);

				if (field.getAnnotation(Log.class) != null)
					field.set(bean, Logger.getLogger(bean.getClass()));
			}
		});

		return bean;
	}
}