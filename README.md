# AME_Editor
Adobe Media Encoder Batch Editor

This is a small tool to help with editing the batch.xml list of Adobe Media Encoder CS5. It's written in Java, so all you need is the Java Runtime Environment version 7 or higher (which is probably already installed on your system) and it should work on any platform.

This is helpful for a couple reasons:
- When adding multiple sequences, AME doesn't keep them in any sort of order.
- AME uses the project file name as the export name instead of the sequence name, so you end up with main, main_1, main_2, etc which are out of order from the order that you added them, so Sequence 01 will be main_4, Sequence 02 will be main, etc. and it's a pain to manually set each export name.
  
This tool solves these problems by allowing you to map sequences to file names
and then editing AME's batch.xml for you.

## Basic How-To:

1. Hit "Detect" to automatically enter the path to your AME batch.xml file.
  * This probably only works on Windows - if it doesn't work, just hit "Detect" and modify to the actual path, it's probably very similar.
2. Click "Read From batch.xml" to populate the left panel with project and sequence names currently in the batch file (and the right panel with the sequence names).
3. Add/remove entries on the left as necessary - only batch entries that exist in the left panel will be modified and all others will not be touched.
  * Use the "Populate Left" button if you have a bunch of "Nested Sequence" entries that you need mapped.
4. Enter/modify the list of file names on the right - this list should be the same size as the one on the left and should be the names that you want your sequences exported to.
  * Use the "Populate From BMP Files in Folder" button if you've taken bitmap screenshots of each sequence and you want the exported sequence to have the same name as the screenshot. Find the folder that you placed your screenshots in - the right side will automatically be populated with the list of BMP files in that directory.
5. Enter your project path (the path you want your sequences exported to) in "Export Destination Path".
6. Enter the extension for the file names for your files.
7. Hit "Process" - this will back up your batch.xml file to batch_old.xml and create a new batch.xml file with your changes.
8. There are two processing options:
  * "Left items can be duplicates and are mapped in order" - this process will go through the batch file until it finds the first sequence name in the left panel, perform the mapping, then continue. This allows duplicate sequence name mappings as long as the desired order matches that of the batch file.
  * "Left items are unique and all instances in batch file are mapped regardless of order" - this process will go through the batch file and, for each sequence, search for a matching sequence name in the left panel and perform the mapping. This is the 1.0 version behavior and is useful for when the batch list is out-of-order (and usually used with the "Populate Left" button for automatic Nested Sequence population).
9. Re-open Adobe Media Encoder and ensure the list was updated correctly.

There's minimal error-checking so don't put any silly characters in your sequence
names or file names.