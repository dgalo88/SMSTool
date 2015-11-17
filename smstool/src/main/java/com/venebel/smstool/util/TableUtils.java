package com.venebel.smstool.util;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.context.MessageSource;

import com.google.gson.Gson;

public class TableUtils {

	/**
	 * Build data and columns for table.
	 * 
	 * @param objects contains data for the table
	 * @param columns contains columns for the table
	 * @return json needed to build the table.
	 */
	public static String buildDataTable(List<Object> objects, LinkedHashMap<String, String> columns) {
		
		StringBuilder json = new StringBuilder();
		Gson gson = new Gson();
		
		json.append("{\"data\":[ ");

		for (int i = 0; i < objects.size(); i++) {
			json.append(gson.toJson(objects.get(i)));

			if (i < objects.size() - 1) {
				json.append(", ");
			}
		}

		json.append(" ]");
		
		String columnsTable = ", \"columns\":[ ";
		
		Iterator<String> it = columns.keySet().iterator();
		while( it.hasNext() ) {
		  String key = (String) it.next();
		  columnsTable += " { \"data\": \"" + key + "\", \"title\": \"" + columns.get(key) + "\"},";
		}
		
		columnsTable += " ]}";
		columnsTable = columnsTable.replace(", ]}", " ]}");
		
		json.append(columnsTable);
		
		return json.toString();
		
	}
	
	/**
	 * Build actions buttons for table.
	 * 
	 * @param messageSource messages from properties.
	 * @return HTML with actions for table.
	 */
	public static String buildButtonsActions(MessageSource messageSource) {
		
		return new String("<div class='wrapper text-center'> "
						 + "<div class='btn-group centered'> "
						 + "<a class='btn btn-default view' role='button' data-toggle='tooltip' title='" + messageSource.getMessage("smstool.button.edit", null, null) + "'> "
						 + "<span class='glyphicon glyphicon-search'></span> "
						 + "</a> "
						 + "<a class='btn btn-default delete' role='button' data-toggle='tooltip' title='" + messageSource.getMessage("smstool.button.delete", null, null) + "'> "
						 + "<span class='glyphicon glyphicon-remove'></span> "
						 + "</a> "
						 + "</div> "
						 + "</div>");
	}
	
}
