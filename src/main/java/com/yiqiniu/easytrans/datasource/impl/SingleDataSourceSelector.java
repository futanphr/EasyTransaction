package com.yiqiniu.easytrans.datasource.impl;

import javax.sql.DataSource;

import org.springframework.transaction.PlatformTransactionManager;

import com.yiqiniu.easytrans.datasource.DataSourceSelector;
import com.yiqiniu.easytrans.protocol.EasyTransRequest;

public class SingleDataSourceSelector implements DataSourceSelector {
	
	private DataSource dataSource;
	
	private PlatformTransactionManager transactionManager;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void setTransactionManager(PlatformTransactionManager transactionManager) {
		this.transactionManager = transactionManager;
	}

	@Override
	public DataSource selectDataSource(String appId, String busCode, String  trxId) {
		return dataSource;
	}

	@Override
	public PlatformTransactionManager selectTransactionManager(String appId, String busCode, String trxId) {
		return transactionManager;
	}

	@Override
	public DataSource selectDataSource(String appId, String busCode, EasyTransRequest<?, ?> request) {
		return dataSource;
	}

	@Override
	public PlatformTransactionManager selectTransactionManager(String appId, String busCode, EasyTransRequest<?, ?> request) {
		return transactionManager;
	}
}
