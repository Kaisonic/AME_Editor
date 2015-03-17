# AME_Editor
Adobe Media Encoder Batch Editor

This is a small tool to help with editing the batch.xml list of Adobe Media Encoder CS5.

This is helpful for a couple reasons:
- When adding multiple sequences, AME doesn't keep them in any sort of order.
- AME uses the project file name as the export name instead of the sequence name, so you end up with main, main_1, main_2, etc which are out of order from the order that you added them, so Sequence 01 will be main_4, Sequence 02 will be main, etc. and it's a pain to manually set each export name.
  
This tool solves these problems by allowing you to map sequences to file names
and then editing AME's batch.xml for you.

## Basic How-To:

1. Hit "Detect" to automatically enter the path to your AME batch.xml file.
  * This probably only works on Windows - if it doesn't work, just hit "Detect" and modify to the actual path, it's probably very similar.
2. Enter your list of sequences on the left - this list should match the sequence names that you have added to Adobe Media Encoder and want to be changed.
  * Use the "Nested" button if your sequences are all named "Nested Sequence 01", "Nested Sequence 02", etc. Enter the range of numbers and hit "Nested" to automatically populate the left side with nested sequence names.
3. Enter your list of file names on the right - this list should be the same size as the one on the left and should be the names that you want your sequences exported to.
  * Use the "Browse" button if you've taken bitmap screenshots of each sequence and you want the exported sequence to have the same name as the screenshot. Find the folder that you placed your screenshots in - the right side will automatically be populated with the list of bmp files in that directory.
4. Enter your project path (the path you want your sequences exported to) if it's different than the one your screenshots are in (or if you didn't use the Browse button).
5. Hit "Process" - this will back up your batch.xml file to batch_old.xml and create a new batch.xml file with your changes.
6. It will go through each entry in your AME batch file and, if the sequence name matches an entry on the left, it will change the output name to be the matching entry on the right, and it will change the output path to your selected Project Path.
7. Re-open Adobe Media Encoder and ensure the list was updated correctly.

There's minimal error-checking so don't put any silly characters in your sequence
names or file names.

##Advanced How-To:

Here's an example workflow for when you want to split a long sequence into smaller sequences and encode each smaller sequence into multiple versions for the web:

1. Create your long sequence in Premiere Pro using chapter markers to mark where you're going to split it up.
2. Create a new sequence and place your long sequence in it.
3. Go through and cut your long sequence "clip" on all of your markers (unfortunately I have yet to find a way to automate this, so it's a lot of zoom, cut, zoom out, scroll, zoom, cut, etc, unless you don't mind your splits not being exactly on your chapter markers).
4. While you're doing this, for each section, take a screenshot in bitmap format (that you will use as the web thumbnail), and name the screenshot what you would like the exported file to be named. (So if this section is going to be show_4.mp4, name the screenshot show_4.bmp and place it in the folder that you're going to put your exports.)
5. Now that your long sequence is all split up, click each part and hit "Nest" - this will create a new sequence that contains only the section of your large sequence that you selected.
6. You should now have a bunch of "Nested Sequences" that are numbered (not necessarily from 1, which is ok - it may be Nested Sequence 04 to Nested Sequence 24 or something). These nested sequences should match the list of screenshots that you took.
7. Open up Adobe Media Encoder and add all of your nested sequences from your Premiere Pro project. I prefer this over hitting "Export to Media Encoder" in Premiere because the latter creates a copy of your project and places it in your Temp folder. Adding the sequences directly in AME uses the original project file, so any additional changes that you make will be reflected in any files that haven't exported yet.
8. Notice that AME didn't keep your Nested Sequences in any order and that they're all named whatever your project is named.
9. Close Adobe Media Encoder and open up AME Editor.
10. Hit "Detect" to get the path to your batch file (only works on Windows with CS5 - otherwise just manually enter the path to your batch file, it's probably very similar).
11. Put the range of your nested sequences in on the left side and hit "Nested" to populate the left side with your nested sequence names.
12. Hit "Browse" and select the folder that you placed all your screenshots in - this will populate the right side with the name of any bmp file in the folder you selected.
13. Project folder will automatically populate with the folder you selected above, but you can change it to wherever you want your files exported.
14. Hit "Process" - this will go through each entry in your AME batch file and, if the sequence name matches an entry on the left, it will change the output name to be the matching entry on the right, and it will change the output path to your selected Project Path.
15. Re-open Adobe Media Encoder.
16. Voila!
