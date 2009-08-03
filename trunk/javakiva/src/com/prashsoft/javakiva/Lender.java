/*
 * Lender.java: The Lender Object
 * 
 * Copyright (C) 2009 prashsoft.com
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * version 2 as published by the Free Software Foundation:
 * http://www.gnu.org/licenses/gpl-2.0.html
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License version 2 for more details:
 * http://www.gnu.org/licenses/gpl-2.0.html
 * 
 * You should have received a copy of the GNU General Public License
 * version 2 along with this program; if not, write to the
 * Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor,
 * Boston, MA  02110-1301, USA. 
 */

package com.prashsoft.javakiva;

import java.util.Date;

public class Lender {

    /* Country Code */
    private String countryCode;

    /* Image */
    private Image image;

    /* Invitee Count */
    private Integer inviteeCount;

    /* Lender Id */
    private String lenderId;

    /* Loan Because */
    private String loanBecause;

    /* Loan Count */
    private Integer loanCount;

    /* Member Since */
    private Date memberSince;

    /* Name */
    private String name;

    /* Occupation */
    private String occupation;

    /* Occupational Info */
    private String occupationalInfo;

    /* Personal Url */
    private String personalUrl;

    /* UID */
    private String uid;

    /* Whereabouts */
    private String whereabouts;

    /**
     * Default Constructor
     */
    public Lender() {

    }

    /**
     * Get Country Code
     * 
     * @return countryCode - Country Code - String
     * @see String
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Get Image
     * 
     * @return image - Image - String
     * @see String
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Get Invitee Count
     * 
     * @return inviteeCount - Invitee Count - Integer
     * @see Integer
     */
    public Integer getInviteeCount() {
        return this.inviteeCount;
    }

    /**
     * Get Lender Id
     * 
     * @return lenderId - Lender Id - String
     * @see String
     */
    public String getLenderId() {
        return this.lenderId;
    }

    /**
     * Get Loan Because
     * 
     * @return loanBecause - Loan Because - String
     * @see String
     */
    public String getLoanBecause() {
        return this.loanBecause;
    }

    /**
     * Get Loan Count
     * 
     * @return loanCount - Loan Count - Integer
     * @see Integer
     */
    public Integer getLoanCount() {
        return this.loanCount;
    }

    /**
     * Get Member Since
     * 
     * @return memberSince - Member Since - Date
     * @see Date
     */
    public Date getMemberSince() {
        return this.memberSince;
    }

    /**
     * Get Name
     * 
     * @return name - Name - String
     * @see String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get occupation
     * 
     * @return occupation - occupation - String
     * @see String
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Get Occupational Info
     * 
     * @return occupationalInfo - Occupational Info - String
     * @see String
     */
    public String getOccupationalInfo() {
        return this.occupationalInfo;
    }

    /**
     * Get Personal Url
     * 
     * @return personalUrl - Personal Url - String
     * @see String
     */
    public String getPersonalUrl() {
        return this.personalUrl;
    }

    /**
     * Get uid
     * 
     * @return uid - uid - String
     * @see String
     */
    public String getUid() {
        return uid;
    }

    /**
     * Get Whereabouts
     * 
     * @return whereabouts - Whereabouts - String
     * @see String
     */
    public String getWhereabouts() {
        return this.whereabouts;
    }

    /**
     * Set Country Code
     * 
     * @param countryCode
     *            - Country Code - String
     * @see String
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Set Image
     * 
     * @param image
     *            - Image - String
     * @see String
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * Set Invitee Count
     * 
     * @param inviteeCount
     *            - Invitee Count - Integer
     * @see Integer
     */
    public void setInviteeCount(Integer inviteeCount) {
        this.inviteeCount = inviteeCount;
    }

    /**
     * Set Lender Id
     * 
     * @param lenderId
     *            - Lender Id - String
     * @see String
     */
    public void setLenderId(String lenderId) {
        this.lenderId = lenderId;
    }

    /**
     * Set Loan Because
     * 
     * @param loanBecause
     *            - Loan Because - String
     * @see String
     */
    public void setLoanBecause(String loanBecause) {
        this.loanBecause = loanBecause;
    }

    /**
     * Set Loan Count
     * 
     * @param loanCount
     *            - Loan Count - Integer
     * @see Integer
     */
    public void setLoanCount(Integer loanCount) {
        this.loanCount = loanCount;
    }

    /**
     * Set Member Since
     * 
     * @param memberSince
     *            - Member Since - Date
     * @see Date
     */
    public void setMemberSince(Date memberSince) {
        this.memberSince = memberSince;
    }

    /**
     * Set Name
     * 
     * @param name
     *            - Name - String
     * @see String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set occupation
     * 
     * @param occupation
     *            - occupation - String
     * @see String
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * Set Occupational Info
     * 
     * @param occupationalInfo
     *            - Occupational Info - String
     * @see String
     */
    public void setOccupationalInfo(String occupationalInfo) {
        this.occupationalInfo = occupationalInfo;
    }

    /**
     * Set Personal Url
     * 
     * @param personalUrl
     *            - Personal Url - String
     * @see String
     */
    public void setPersonalUrl(String personalUrl) {
        this.personalUrl = personalUrl;
    }

    /**
     * Set uid
     * 
     * @param uid
     *            - uid - String
     * @see String
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * Set Whereabouts
     * 
     * @param whereabouts
     *            - Whereabouts - String
     * @see String
     */
    public void setWhereabouts(String whereabouts) {
        this.whereabouts = whereabouts;
    }

    /**
     * To String
     * 
     * @return toString Of Attributes
     * @see String
     */
    @Override
    public String toString() {
        return "Lender Id: " + lenderId + "\nName: " + name + "\nImage URL: " + image.getImageUrl() + "\nWhereabouts: "
                + whereabouts + "\nCountry Code: " + countryCode + "\nUID: " + uid + "\nMember Since: " + memberSince
                + "\nPersonal Url: " + personalUrl + "\nOccupation: " + occupation + "\nLoan Because: " + loanBecause
                + "\nOccupational Info: " + occupationalInfo + "\nLoan Count: " + loanCount + "\nInvitee Count: "
                + inviteeCount;
    }

}