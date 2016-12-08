package cn.zookeeper.service;

import org.springframework.cloud.zookeeper.discovery.watcher.DependencyState;
import org.springframework.cloud.zookeeper.discovery.watcher.DependencyWatcherListener;

public class ZookeeperService implements DependencyWatcherListener {

	@Override
	public void stateChanged(String arg0, DependencyState arg1) {
		// TODO Auto-generated method stub
		
	}

}
