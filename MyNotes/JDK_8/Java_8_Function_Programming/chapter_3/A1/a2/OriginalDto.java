package JDK_8.Java_8_Function_Programming.chapter_3.A1.a2;

import java.time.LocalDateTime;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/29
 * \* Time: 19:33
 * \* Description:
 * \
 */
public class OriginalDto {

    private String id;

    private String regionId;

    private LocalDateTime deviceTime;

    private Double noiseValue;

    private Double noiseStatus;


    public OriginalDto(String id, String regionId, LocalDateTime deviceTime, Double noiseValue, Double noiseStatus) {
        this.id = id;
        this.regionId = regionId;
        this.deviceTime = deviceTime;
        this.noiseValue = noiseValue;
        this.noiseStatus = noiseStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public LocalDateTime getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(LocalDateTime deviceTime) {
        this.deviceTime = deviceTime;
    }

    public Double getNoiseValue() {
        return noiseValue;
    }

    public void setNoiseValue(Double noiseValue) {
        this.noiseValue = noiseValue;
    }

    public Double getNoiseStatus() {
        return noiseStatus;
    }

    public void setNoiseStatus(Double noiseStatus) {
        this.noiseStatus = noiseStatus;
    }
}
