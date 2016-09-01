package com.braunster.chatsdk.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.internal.DaoConfig;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;

import com.braunster.chatsdk.dao.BMessage;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table BMESSAGE.
*/
public class BMessageDao extends AbstractDao<BMessage, Long> {

    public static final String TABLENAME = "BMESSAGE";

    /**
     * Properties of entity BMessage.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property EntityID = new Property(1, String.class, "entityID", false, "ENTITY_ID");
        public final static Property Date = new Property(2, java.util.Date.class, "date", false, "DATE");
        public final static Property IsRead = new Property(3, Boolean.class, "isRead", false, "IS_READ");
        public final static Property Resources = new Property(4, String.class, "resources", false, "RESOURCES");
        public final static Property ResourcesPath = new Property(5, String.class, "resourcesPath", false, "RESOURCES_PATH");
        public final static Property Text = new Property(6, String.class, "text", false, "TEXT");
        public final static Property ImageDimensions = new Property(7, String.class, "imageDimensions", false, "IMAGE_DIMENSIONS");
        public final static Property Type = new Property(8, Integer.class, "type", false, "TYPE");
        public final static Property Status = new Property(9, Integer.class, "status", false, "STATUS");
        public final static Property Delivered = new Property(10, Integer.class, "delivered", false, "DELIVERED");
        public final static Property Sender = new Property(11, Long.class, "Sender", false, "SENDER");
        public final static Property BThreadDaoId = new Property(12, Long.class, "BThreadDaoId", false, "BTHREAD_DAO_ID");
    };

    private DaoSession daoSession;

    private Query<BMessage> bThread_MessagesQuery;

    public BMessageDao(DaoConfig config) {
        super(config);
    }
    
    public BMessageDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'BMESSAGE' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ENTITY_ID' TEXT," + // 1: entityID
                "'DATE' INTEGER," + // 2: date
                "'IS_READ' INTEGER," + // 3: isRead
                "'RESOURCES' TEXT," + // 4: resources
                "'RESOURCES_PATH' TEXT," + // 5: resourcesPath
                "'TEXT' TEXT," + // 6: text
                "'IMAGE_DIMENSIONS' TEXT," + // 7: imageDimensions
                "'TYPE' INTEGER," + // 8: type
                "'STATUS' INTEGER," + // 9: status
                "'DELIVERED' INTEGER," + // 10: delivered
                "'SENDER' INTEGER," + // 11: Sender
                "'BTHREAD_DAO_ID' INTEGER);"); // 12: BThreadDaoId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'BMESSAGE'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BMessage entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String entityID = entity.getEntityID();
        if (entityID != null) {
            stmt.bindString(2, entityID);
        }
 
        java.util.Date date = entity.getDate();
        if (date != null) {
            stmt.bindLong(3, date.getTime());
        }
 
        Boolean isRead = entity.getIsRead();
        if (isRead != null) {
            stmt.bindLong(4, isRead ? 1l: 0l);
        }
 
        String resources = entity.getResources();
        if (resources != null) {
            stmt.bindString(5, resources);
        }
 
        String resourcesPath = entity.getResourcesPath();
        if (resourcesPath != null) {
            stmt.bindString(6, resourcesPath);
        }
 
        String text = entity.getText();
        if (text != null) {
            stmt.bindString(7, text);
        }
 
        String imageDimensions = entity.getImageDimensions();
        if (imageDimensions != null) {
            stmt.bindString(8, imageDimensions);
        }
 
        Integer type = entity.getType();
        if (type != null) {
            stmt.bindLong(9, type);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(10, status);
        }
 
        Integer delivered = entity.getDelivered();
        if (delivered != null) {
            stmt.bindLong(11, delivered);
        }
 
        Long Sender = entity.getSender();
        if (Sender != null) {
            stmt.bindLong(12, Sender);
        }
 
        Long BThreadDaoId = entity.getBThreadDaoId();
        if (BThreadDaoId != null) {
            stmt.bindLong(13, BThreadDaoId);
        }
    }

    @Override
    protected void attachEntity(BMessage entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public BMessage readEntity(Cursor cursor, int offset) {
        BMessage entity = new BMessage( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // entityID
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // date
            cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0, // isRead
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // resources
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // resourcesPath
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // text
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // imageDimensions
            cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8), // type
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // status
            cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10), // delivered
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11), // Sender
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12) // BThreadDaoId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BMessage entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setEntityID(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDate(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setIsRead(cursor.isNull(offset + 3) ? null : cursor.getShort(offset + 3) != 0);
        entity.setResources(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setResourcesPath(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setText(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setImageDimensions(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setType(cursor.isNull(offset + 8) ? null : cursor.getInt(offset + 8));
        entity.setStatus(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setDelivered(cursor.isNull(offset + 10) ? null : cursor.getInt(offset + 10));
        entity.setSender(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
        entity.setBThreadDaoId(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(BMessage entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(BMessage entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "messages" to-many relationship of BThread. */
    public List<BMessage> _queryBThread_Messages(Long BThreadDaoId) {
        synchronized (this) {
            if (bThread_MessagesQuery == null) {
                QueryBuilder<BMessage> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.BThreadDaoId.eq(null));
                bThread_MessagesQuery = queryBuilder.build();
            }
        }
        Query<BMessage> query = bThread_MessagesQuery.forCurrentThread();
        query.setParameter(0, BThreadDaoId);
        return query.list();
    }

    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getBUserDao().getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T1", daoSession.getBThreadDao().getAllColumns());
            builder.append(" FROM BMESSAGE T");
            builder.append(" LEFT JOIN BUSER T0 ON T.'SENDER'=T0.'_id'");
            builder.append(" LEFT JOIN BTHREAD T1 ON T.'BTHREAD_DAO_ID'=T1.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected BMessage loadCurrentDeep(Cursor cursor, boolean lock) {
        BMessage entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        BUser BUserSender = loadCurrentOther(daoSession.getBUserDao(), cursor, offset);
        entity.setBUserSender(BUserSender);
        offset += daoSession.getBUserDao().getAllColumns().length;

        BThread BThread = loadCurrentOther(daoSession.getBThreadDao(), cursor, offset);
        entity.setBThread(BThread);

        return entity;    
    }

    public BMessage loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<BMessage> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<BMessage> list = new ArrayList<BMessage>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<BMessage> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<BMessage> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
