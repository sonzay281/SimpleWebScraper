/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buks.webscrapper;

import java.io.IOException;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author Anonymous
 */
public class webcrowler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String site, tag, att;
        int option;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my site crowler.....");
        System.out.print("Please eter the site URL:");
        site = input.next();
        System.out.print("Please enter the tag:");
        tag = input.next();
        System.out.print("Please inter the attribute:");
        att = input.next();
        System.out.println("Scraping........");
        try {
            Document doc = Jsoup.connect(site).get();
            org.jsoup.select.Elements links = doc.select(tag);
            links.stream().forEach((e) -> {
                System.out.println(e.attr(att));
            });

        } catch (IOException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
