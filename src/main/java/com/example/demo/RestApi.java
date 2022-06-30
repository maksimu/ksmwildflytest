package com.example.demo;

import com.keepersecurity.secretsManager.core.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class RestApi {

    @GetMapping("/ksm")
    public int ksmconfig() {
        System.out.println("HI mom 2");

        InMemoryStorage storage = new InMemoryStorage("eyJhcHBLZXkiOiJocFBvUldaMUMwbEJtMlpPK0hBb3Uxcyt2STZ2SnRWMTZKaDF5U21FcmZZPSIsImFwcE93bmVyUHVibGljS2V5IjoiQlBnZlF4ZUpONVR2WFRqa0p6dVdwNWhMV2Q1SC9DRFpaYkw1dkFkbSttN0hNcmxCdVlFaXFiZFBHd0NqSzBvQUY1UTBCWEFYc2VVNmQxalozQjhwajU4PSIsImNsaWVudElkIjoiUjZoZUlFc2U3UkNES0lQRkE3dU12ZUVOU0xHUDBSMWhEdEJtNDM1dHNHMXNBR1hZRm1JcWNsendkYU5wL0hrbExiTVdCN25IQmxKSUhwTjBjeVNtZnc9PSIsImhvc3RuYW1lIjoia2VlcGVyc2VjdXJpdHkuY29tIiwicHJpdmF0ZUtleSI6Ik1JR0hBZ0VBTUJNR0J5cUdTTTQ5QWdFR0NDcUdTTTQ5QXdFSEJHMHdhd0lCQVFRZ2dKSGZlUmkyZnNEMjdiS28zSWFkZFBPUXZ3bW9aZWNlUTVXdCtYYzg4Z3FoUkFOQ0FBVEhrTm9wQjZoMWtlWEZKM3JES2NVY1hJMVJJdkpkTmcvUFlIMlNUNWYrUjdUeXhpeDkxTGZKOG5LVFhSV0p1UHVjUlJlYmtKSk4yYkpzMW85TWJTUTYiLCJzZXJ2ZXJQdWJsaWNLZXlJZCI6IjEwIn0");

        SecretsManagerOptions options = new SecretsManagerOptions(storage);

        KeeperSecrets secrets = SecretsManager.getSecrets(options, Collections.emptyList());
        System.out.println("HI mom 3");

        List<KeeperRecord> allRecords = secrets.getRecords();
        return allRecords.size();

//        return -1;
    }

}
