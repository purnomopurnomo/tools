package com.cisco.oss.tools;

import com.cisco.oss.tools.model.PacketContainer;
import org.apache.commons.lang3.tuple.Pair;
import org.pcap4j.packet.Packet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@SpringBootApplication
@ComponentScan({"com.cisco.oss"})
@EnableAsync
public class PacketDumperApplication {

    public static void main(String[] args) {
        SpringApplication.run(PacketDumperApplication.class, args);
    }

    @Bean
    public BlockingQueue<Map<String, Object>> queue() {
        return new LinkedBlockingQueue<>();
    }

    @Bean
    public BlockingQueue<PacketContainer> packetQueue() {
        return new LinkedBlockingQueue<>();
    }

}
