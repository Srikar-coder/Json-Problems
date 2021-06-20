package json_prob3;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import json_prob3.oops.model.stock;

public class JsonUtil_3 {
	public List<stock> convertJsonObj(String filePath) {
		try {
			ObjectMapper objMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,false);
			File jsonFile = new File(filePath);
			List<stock> stockList = objMapper.readValue(jsonFile, new TypeReference<List<stock>>() {
			});
			return stockList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
