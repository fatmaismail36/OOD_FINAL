package supplychaintrackingsystem;

import java.util.ArrayList;
import java.util.List;

public class RawMaterial {

    private String materialID;
    private String materialData;

    private boolean approved;

   
    private String status;              
    private String qualityStatus;       
    private String issueDescription;

    private final List<String> activityLog = new ArrayList<>();

    public RawMaterial() {
        this.status = "Pending";
        this.qualityStatus = "Not Checked";
        this.issueDescription = "";
    }

    public RawMaterial(String materialID, String materialData) {
        this();
        this.materialID = materialID;
        this.materialData = materialData;
    }


    public String getMaterialID() {
        return materialID;
    }

    public String getMaterialData() {
        return materialData;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getStatus() {
        return status;
    }

    public String getQualityStatus() {
        return qualityStatus;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public List<String> getActivityLog() {
        return activityLog;
    }

   
    public boolean registerRawMaterial(String materialData) {

        if (materialData == null || materialData.trim().isEmpty()) {
            return false;
        }

        if (this.materialData != null &&
            this.materialData.equalsIgnoreCase(materialData.trim())) {
            return false;
        }

        this.materialData = materialData.trim();
        this.approved = false;
        this.status = "Pending";

        activityLog.add("Material registered with data: " + this.materialData);

        return true;
    }

 
    public boolean linkRawMaterial(String materialID) {

        if (materialID == null || materialID.trim().isEmpty()) {
            return false;
        }

        this.materialID = materialID.trim();
        activityLog.add("Material ID linked: " + this.materialID);

        return true;
    }

    public boolean approveMaterial(int adminID) {

        if (adminID <= 0) return false;

        if (materialID == null || materialData == null) {
            return false;
        }

        if (approved) {
            return false;
        }

        approved = true;
        status = "Approved";

        activityLog.add("Material approved by Admin ID: " + adminID);

        return true;
    }

    public boolean checkQuality() {

        if (materialID == null || materialData == null) {
            return false;
        }

        qualityStatus = "Checked";

        activityLog.add("Quality checked for material: " + materialID);

        return true;
    }

    public boolean updateMaterialData(String newData) {

        if (newData == null || newData.trim().isEmpty()) {
            return false;
        }

        this.materialData = newData.trim();
        this.approved = false;
        this.status = "Pending";

        activityLog.add("Material data updated: " + this.materialData);

        return true;
    }

    public boolean reportIssue(String issueDescription) {

        if (issueDescription == null || issueDescription.trim().isEmpty()) {
            return false;
        }

        this.issueDescription = issueDescription.trim();
        this.status = "Issue Reported";
        this.approved = false;

        activityLog.add("Issue reported: " + this.issueDescription);

        return true;
    }

    public boolean revokeApproval(String reason) {

        if (!approved) {
            return false;
        }

        if (reason == null || reason.trim().isEmpty()) {
            return false;
        }

        approved = false;
        status = "Revoked";

        activityLog.add("Approval revoked. Reason: " + reason);

        return true;
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "materialID='" + materialID + '\'' +
                ", materialData='" + materialData + '\'' +
                ", approved=" + approved +
                ", status='" + status + '\'' +
                ", qualityStatus='" + qualityStatus + '\'' +
                ", issueDescription='" + issueDescription + '\'' +
                '}';
    }
}