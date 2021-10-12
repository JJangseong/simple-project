//
//  ScenDelegate.swift
//  front
//
//  Created by 장성진 on 2021/10/12.
//

import Foundation

func scene(_ scene: UIScene, openURLContexts URLContexts: Set<UIOpenURLContext>) {
    if let url = URLContexts.first?.url {
        print("url = \(url)")
    }
}
