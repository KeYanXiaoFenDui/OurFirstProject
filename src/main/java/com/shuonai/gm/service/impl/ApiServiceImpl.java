package com.shuonai.gm.service.impl;

import com.shuonai.gm.domain.Api;
import com.shuonai.gm.mapper.ApiMapper;
import com.shuonai.gm.service.IApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiServiceImpl implements IApiService {
    @Autowired
    private ApiMapper apiMapper;

    @Override
    public int insertApi(Api api) {
        return apiMapper.insertApi(api);
    }

    @Override
    public int updateApi(Api api) {
        return apiMapper.updateApi(api);
    }

    @Override
    public int deleteApi(int id) {
        return apiMapper.deleteApi(id);
    }

    @Override
    public Api getApi(int id) {
        return apiMapper.getApi(id);
    }

    @Override
    public int getSeq() {
        return apiMapper.getSeq();
    }

    @Override
    public int updateSeq(int row) {
        return apiMapper.updateSeq(row);
    }

    @Override
    public List<Api> getApiList() {
        return apiMapper.getApiList();
    }
}