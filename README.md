# MTG-Draft-Pack-Converter
Simple Java script using regular expressions to convert randomly generated packs into usable imports for Tabletop Simulator. 

In order to facilitate online Draft play (and other niche formats requiring digital pack opening) with friends in ways that popular MTG clients do not, this script allows you to randomly generate digital packs on external pack randomizer software and then cleanly modifies the data into a form usable by TTS. 

Uses the following export formula from [botbox.dev](https://botbox.dev/);
  n CARDNAME SET #
And converts to the following formula valid with [Oops I Baked A Pie's scripted MTG 4 player table](https://steamcommunity.com/sharedfiles/filedetails/?id=2296042369);
  nx CARDNAME (set) #

# Requirements
Java 8 or newer

# Usage
1. Generate a pack or cardlist from botbox.dev and select Copy Pack
2. Run the .java file in a runtime environment
3. Paste the raw pack string and press enter
4. Copy the generated output and paste it into the TTS deck importer
