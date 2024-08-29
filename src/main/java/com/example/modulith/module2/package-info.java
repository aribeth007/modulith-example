@ApplicationModule(displayName = "module2", allowedDependencies = {
        "commons",
        "module1"
})
package com.example.modulith.module2;

import org.springframework.modulith.ApplicationModule;