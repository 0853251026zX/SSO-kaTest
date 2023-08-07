package code.internship.service;

import java.lang.reflect.Field;
import java.sql.Timestamp;
import java.util.Date;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.engine.spi.EntityEntryExtraState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import code.internship.entity.SSOUserEntity;
import code.internship.model.SSOUserModel;
import code.internship.repository.SSOUserJDBCRepository;
import code.internship.repository.SSOUserJPARepository;

@Service
@Transactional
@Validated
public class SSOUserService {

	@Autowired
	private SSOUserJPARepository jpaRepo;

	@Autowired
	private SSOUserJDBCRepository jdbcRepo;

	public SSOUserEntity insert(@Valid SSOUserModel model) {
		SSOUserEntity entity = MtoE(model);
		return jpaRepo.save(entity);
	}
	
	public SSOUserEntity insertv2(@Valid SSOUserModel model) throws IllegalAccessException {
		SSOUserEntity entity = MtoEVer2(model);
		return jpaRepo.save(entity);
	}

	private SSOUserEntity MtoE(SSOUserModel SSOModel) {// set model to entity
		SSOUserEntity entities = new SSOUserEntity();
		entities.setRequestDate(new Timestamp(new Date().getTime()));
		entities.setSsoType(SSOModel.getSsoType());
		entities.setSystemId(SSOModel.getSystemId());
		entities.setSystemName(SSOModel.getSystemName());
		entities.setSystemTransactions(SSOModel.getSystemTransactions());
		entities.setSystemPrivileges(SSOModel.getSystemPrivileges());
		entities.setSystemUserGroup(SSOModel.getSystemUserGroup());
		entities.setSystemLocationGroup(SSOModel.getSystemLocationGroup());
		entities.setUserId(SSOModel.getUserId());
		entities.setUserFullName(SSOModel.getUserFullName());
		entities.setUserRdOfficeCode(SSOModel.getUserRdOfficeCode());
		entities.setUserOfficeCode(SSOModel.getUserOfficeCode());
		entities.setClientLocation(SSOModel.getClientLocation());
		entities.setLocationMachineNumber(SSOModel.getLocationMachineNumber());
		entities.setTokenId(SSOModel.getTokenId());
		return entities;
	}

	private SSOUserEntity MtoEVer2(SSOUserModel SSOModel) throws IllegalAccessException {
		SSOUserEntity entities = new SSOUserEntity();
		entities.setRequestDate(new Timestamp(new Date().getTime()));

		Field[] modelFields = SSOModel.getClass().getDeclaredFields();
		Field[] entityFields = SSOUserEntity.class.getDeclaredFields();

		for (Field entityField : entityFields) {
			for (Field modelField : modelFields) {
				if (entityField.getName().equals(modelField.getName())) {
					entityField.setAccessible(true);
					modelField.setAccessible(true);
					entityField.set(entities, modelField.get(SSOModel));
					break;
				}
			}
		}

		return entities;
	}
}
