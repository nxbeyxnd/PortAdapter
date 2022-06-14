# PortAdapter

## how to add this dependency:
1. add to your's pom.xml this lines :
```
<repositories>
        <repository>
            <id>[name-project]-mvn-repo</id>
            <url>https://raw.github.com/nxbeyxnd/PortAdapter/mvn-repo/</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>ru.alexey</groupId>
            <artifactId>ru.alexey.port_adapter</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>
    </dependencies>
 ```
 
 2. Create object PortAdapter on your's .java file
 3. Done..
 
 
Instruction:
PortAdapter have 2 methods:
1. returnIntArr(String[][]) <- this method will transform your's String array like this:
```new String[]{"1,3-5", "3", "3-4"}```
 to this 
 
 ![Снимок экрана 2022-06-15 в 01 32 57](https://user-images.githubusercontent.com/39539947/173700277-714ae4a1-66d0-41ef-8d0c-06310ca6cc00.png)
 It's two-dimensional array of Integer data
 
2. returnCombinationOfIntegers(Integer[][]) <- this method will show you all combinations of Integer values

![Снимок экрана 2022-06-15 в 01 35 12](https://user-images.githubusercontent.com/39539947/173700521-3550ad06-5f87-4dc3-bdef-8bf6b6c45e48.png)

