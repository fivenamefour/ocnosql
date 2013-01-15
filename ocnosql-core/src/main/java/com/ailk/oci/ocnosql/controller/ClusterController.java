package com.ailk.oci.ocnosql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ailk.oci.ocnosql.entity.Cluster;

@Controller
@RequestMapping("/cluster")
public class ClusterController {
	
	@RequestMapping(value = "/{clusterId}", method = RequestMethod.GET)
	public @ResponseBody
	Cluster getByClusterId(@PathVariable Long clusterId) throws Exception {
		Cluster cluster = new Cluster();
		cluster.setClusterId(clusterId);
		cluster.setClusterName("OcNoSql集群一");

		return cluster;
	}
}
