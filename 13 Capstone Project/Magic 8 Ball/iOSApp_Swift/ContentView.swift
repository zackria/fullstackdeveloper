//
//  ContentView.swift
//  Magic8BallSwift
//
//  Created by Zack Dawoo on 2023-01-15.
//

import SwiftUI

struct ContentView: View {
    
    @State var orientation = UIDevice.current.orientation
    
    @State var labels: [String:String] = [
        "result" : ""]
    
    let orientationChanged = NotificationCenter.default.publisher(for: UIDevice.orientationDidChangeNotification)
        .makeConnectable().autoconnect()
    
    var body: some View {
            
    
            
            Group{
                
                if orientation.isLandscape{
                    
                    
                    
                    HStack {
                        
                        
                        VStack{
                            Text("Ask Magic 8 Ball")
                                .fontWeight(.heavy).font(.system(size:20)).padding()
                            
                                .onTapGesture {
                                    updateMagic8Ball()
                                }
                            
                            HStack{
                                Button{
                                    
                                    updateMagic8Ball()
                                } label: {
                                    Image("Magic8Ball").resizable().scaledToFit()
                                }.padding()
                                
                                
                                Text(labels["result"]!)                .fontWeight(.heavy).font(.system(size:20)) .multilineTextAlignment(.center).padding()
                            }

                            
                            
                        }

                          
                        
                            
                        
                    }.padding(.horizontal, 2)
                    
                    
                }else{
                    VStack {
                        
                    
                        
                    Text("Ask Magic 8 Ball")
                            .fontWeight(.heavy).font(.system(size:36)) .frame(maxWidth: .infinity, alignment: .center).multilineTextAlignment(.center)
                            .onTapGesture {
                                updateMagic8Ball()
                            }
                    
                    Button{
                       
                        updateMagic8Ball()
                    } label: {
                        Image("Magic8Ball").scaledToFit()
                    }
                    
                  
                 
                    
                    Text(labels["result"]!)                .fontWeight(.heavy).font(.system(size:42)) .frame(maxWidth: .infinity, alignment: .center).multilineTextAlignment(.center)
                    }
                    .padding(.vertical, 2)
                }
                
                
                
            }.onReceive(orientationChanged){
                _ in
                self.orientation = UIDevice.current.orientation
                printOrientation()
            }
            
            
       
    }
    
    
    func updateMagic8Ball(){
        
       
        let randomInt = Int.random(in: 1..<21)
        let obj = RandomResponses()
        let resultResponse = obj.responseValues[randomInt]
        print(resultResponse!)
        labels["result"] = resultResponse
    }
    
    func printOrientation(){
        if orientation.isLandscape{
            print("landscape")
        }
        
        if orientation.isPortrait{
            print("Potrait")
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
