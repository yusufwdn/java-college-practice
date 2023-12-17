/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polymorphism.packageX.packageY;

import com.polymorphism.packageX.SuperClassX;

/**
 *
 * @author USER
 */
public class SubClassY extends SuperClassX {
    SuperClassX objX = new SubClassY();
    SubClassY objY   = new SubClassY();

    void subClassMethodY()
    {
        objY.superClassMethodX();

        int i;
        i = objY.superClassVarX;
    }
}